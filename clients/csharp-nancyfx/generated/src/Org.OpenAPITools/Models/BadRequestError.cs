using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// A Bad Request response error.
    /// </summary>
    public sealed class BadRequestError:  IEquatable<BadRequestError>
    { 
        /// <summary>
        /// HTTP status code of the response.
        /// </summary>
        public int? Status { get; private set; }

        /// <summary>
        /// Error type identifier.
        /// </summary>
        public string Type { get; private set; }

        /// <summary>
        /// A short summary of the error.
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Request&#39;s missing parameters.
        /// </summary>
        public List<MissingParameter> MissingParams { get; private set; }

        /// <summary>
        /// Request&#39;s invalid parameters.
        /// </summary>
        public List<InvalidParameter> InvalidParams { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use BadRequestError.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public BadRequestError()
        {
        }

        private BadRequestError(int? Status, string Type, string Title, List<MissingParameter> MissingParams, List<InvalidParameter> InvalidParams)
        {
            
            this.Status = Status;
            
            this.Type = Type;
            
            this.Title = Title;
            
            this.MissingParams = MissingParams;
            
            this.InvalidParams = InvalidParams;
            
        }

        /// <summary>
        /// Returns builder of BadRequestError.
        /// </summary>
        /// <returns>BadRequestErrorBuilder</returns>
        public static BadRequestErrorBuilder Builder()
        {
            return new BadRequestErrorBuilder();
        }

        /// <summary>
        /// Returns BadRequestErrorBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>BadRequestErrorBuilder</returns>
        public BadRequestErrorBuilder With()
        {
            return Builder()
                .Status(Status)
                .Type(Type)
                .Title(Title)
                .MissingParams(MissingParams)
                .InvalidParams(InvalidParams);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(BadRequestError other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (BadRequestError.
        /// </summary>
        /// <param name="left">Compared (BadRequestError</param>
        /// <param name="right">Compared (BadRequestError</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (BadRequestError left, BadRequestError right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (BadRequestError.
        /// </summary>
        /// <param name="left">Compared (BadRequestError</param>
        /// <param name="right">Compared (BadRequestError</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (BadRequestError left, BadRequestError right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of BadRequestError.
        /// </summary>
        public sealed class BadRequestErrorBuilder
        {
            private int? _Status;
            private string _Type;
            private string _Title;
            private List<MissingParameter> _MissingParams;
            private List<InvalidParameter> _InvalidParams;

            internal BadRequestErrorBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for BadRequestError.Status property.
            /// </summary>
            /// <param name="value">HTTP status code of the response.</param>
            public BadRequestErrorBuilder Status(int? value)
            {
                _Status = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadRequestError.Type property.
            /// </summary>
            /// <param name="value">Error type identifier.</param>
            public BadRequestErrorBuilder Type(string value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadRequestError.Title property.
            /// </summary>
            /// <param name="value">A short summary of the error.</param>
            public BadRequestErrorBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadRequestError.MissingParams property.
            /// </summary>
            /// <param name="value">Request&#39;s missing parameters.</param>
            public BadRequestErrorBuilder MissingParams(List<MissingParameter> value)
            {
                _MissingParams = value;
                return this;
            }

            /// <summary>
            /// Sets value for BadRequestError.InvalidParams property.
            /// </summary>
            /// <param name="value">Request&#39;s invalid parameters.</param>
            public BadRequestErrorBuilder InvalidParams(List<InvalidParameter> value)
            {
                _InvalidParams = value;
                return this;
            }


            /// <summary>
            /// Builds instance of BadRequestError.
            /// </summary>
            /// <returns>BadRequestError</returns>
            public BadRequestError Build()
            {
                Validate();
                return new BadRequestError(
                    Status: _Status,
                    Type: _Type,
                    Title: _Title,
                    MissingParams: _MissingParams,
                    InvalidParams: _InvalidParams
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}