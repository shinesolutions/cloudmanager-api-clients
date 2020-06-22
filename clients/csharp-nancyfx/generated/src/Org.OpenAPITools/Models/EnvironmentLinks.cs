using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools._.Models
{
    /// <summary>
    /// EnvironmentLinks
    /// </summary>
    public sealed class EnvironmentLinks:  IEquatable<EnvironmentLinks>
    { 
        /// <summary>
        /// HttpNsAdobeComAdobecloudRelProgram
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelProgram { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPipeline
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPipeline { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelAuthor
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelAuthor { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelPublish
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelPublish { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelDeveloperConsole
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelDeveloperConsole { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelLogs
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelLogs { get; private set; }

        /// <summary>
        /// HttpNsAdobeComAdobecloudRelVariables
        /// </summary>
        public HalLink HttpNsAdobeComAdobecloudRelVariables { get; private set; }

        /// <summary>
        /// Self
        /// </summary>
        public HalLink Self { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EnvironmentLinks.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EnvironmentLinks()
        {
        }

        private EnvironmentLinks(HalLink HttpNsAdobeComAdobecloudRelProgram, HalLink HttpNsAdobeComAdobecloudRelPipeline, HalLink HttpNsAdobeComAdobecloudRelAuthor, HalLink HttpNsAdobeComAdobecloudRelPublish, HalLink HttpNsAdobeComAdobecloudRelDeveloperConsole, HalLink HttpNsAdobeComAdobecloudRelLogs, HalLink HttpNsAdobeComAdobecloudRelVariables, HalLink Self)
        {
            
            this.HttpNsAdobeComAdobecloudRelProgram = HttpNsAdobeComAdobecloudRelProgram;
            
            this.HttpNsAdobeComAdobecloudRelPipeline = HttpNsAdobeComAdobecloudRelPipeline;
            
            this.HttpNsAdobeComAdobecloudRelAuthor = HttpNsAdobeComAdobecloudRelAuthor;
            
            this.HttpNsAdobeComAdobecloudRelPublish = HttpNsAdobeComAdobecloudRelPublish;
            
            this.HttpNsAdobeComAdobecloudRelDeveloperConsole = HttpNsAdobeComAdobecloudRelDeveloperConsole;
            
            this.HttpNsAdobeComAdobecloudRelLogs = HttpNsAdobeComAdobecloudRelLogs;
            
            this.HttpNsAdobeComAdobecloudRelVariables = HttpNsAdobeComAdobecloudRelVariables;
            
            this.Self = Self;
            
        }

        /// <summary>
        /// Returns builder of EnvironmentLinks.
        /// </summary>
        /// <returns>EnvironmentLinksBuilder</returns>
        public static EnvironmentLinksBuilder Builder()
        {
            return new EnvironmentLinksBuilder();
        }

        /// <summary>
        /// Returns EnvironmentLinksBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EnvironmentLinksBuilder</returns>
        public EnvironmentLinksBuilder With()
        {
            return Builder()
                .HttpNsAdobeComAdobecloudRelProgram(HttpNsAdobeComAdobecloudRelProgram)
                .HttpNsAdobeComAdobecloudRelPipeline(HttpNsAdobeComAdobecloudRelPipeline)
                .HttpNsAdobeComAdobecloudRelAuthor(HttpNsAdobeComAdobecloudRelAuthor)
                .HttpNsAdobeComAdobecloudRelPublish(HttpNsAdobeComAdobecloudRelPublish)
                .HttpNsAdobeComAdobecloudRelDeveloperConsole(HttpNsAdobeComAdobecloudRelDeveloperConsole)
                .HttpNsAdobeComAdobecloudRelLogs(HttpNsAdobeComAdobecloudRelLogs)
                .HttpNsAdobeComAdobecloudRelVariables(HttpNsAdobeComAdobecloudRelVariables)
                .Self(Self);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EnvironmentLinks other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EnvironmentLinks.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLinks</param>
        /// <param name="right">Compared (EnvironmentLinks</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EnvironmentLinks left, EnvironmentLinks right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EnvironmentLinks.
        /// </summary>
        /// <param name="left">Compared (EnvironmentLinks</param>
        /// <param name="right">Compared (EnvironmentLinks</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EnvironmentLinks left, EnvironmentLinks right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EnvironmentLinks.
        /// </summary>
        public sealed class EnvironmentLinksBuilder
        {
            private HalLink _HttpNsAdobeComAdobecloudRelProgram;
            private HalLink _HttpNsAdobeComAdobecloudRelPipeline;
            private HalLink _HttpNsAdobeComAdobecloudRelAuthor;
            private HalLink _HttpNsAdobeComAdobecloudRelPublish;
            private HalLink _HttpNsAdobeComAdobecloudRelDeveloperConsole;
            private HalLink _HttpNsAdobeComAdobecloudRelLogs;
            private HalLink _HttpNsAdobeComAdobecloudRelVariables;
            private HalLink _Self;

            internal EnvironmentLinksBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.HttpNsAdobeComAdobecloudRelProgram property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelProgram</param>
            public EnvironmentLinksBuilder HttpNsAdobeComAdobecloudRelProgram(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelProgram = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.HttpNsAdobeComAdobecloudRelPipeline property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPipeline</param>
            public EnvironmentLinksBuilder HttpNsAdobeComAdobecloudRelPipeline(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPipeline = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.HttpNsAdobeComAdobecloudRelAuthor property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelAuthor</param>
            public EnvironmentLinksBuilder HttpNsAdobeComAdobecloudRelAuthor(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelAuthor = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.HttpNsAdobeComAdobecloudRelPublish property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelPublish</param>
            public EnvironmentLinksBuilder HttpNsAdobeComAdobecloudRelPublish(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelPublish = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.HttpNsAdobeComAdobecloudRelDeveloperConsole property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelDeveloperConsole</param>
            public EnvironmentLinksBuilder HttpNsAdobeComAdobecloudRelDeveloperConsole(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelDeveloperConsole = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.HttpNsAdobeComAdobecloudRelLogs property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelLogs</param>
            public EnvironmentLinksBuilder HttpNsAdobeComAdobecloudRelLogs(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelLogs = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.HttpNsAdobeComAdobecloudRelVariables property.
            /// </summary>
            /// <param name="value">HttpNsAdobeComAdobecloudRelVariables</param>
            public EnvironmentLinksBuilder HttpNsAdobeComAdobecloudRelVariables(HalLink value)
            {
                _HttpNsAdobeComAdobecloudRelVariables = value;
                return this;
            }

            /// <summary>
            /// Sets value for EnvironmentLinks.Self property.
            /// </summary>
            /// <param name="value">Self</param>
            public EnvironmentLinksBuilder Self(HalLink value)
            {
                _Self = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EnvironmentLinks.
            /// </summary>
            /// <returns>EnvironmentLinks</returns>
            public EnvironmentLinks Build()
            {
                Validate();
                return new EnvironmentLinks(
                    HttpNsAdobeComAdobecloudRelProgram: _HttpNsAdobeComAdobecloudRelProgram,
                    HttpNsAdobeComAdobecloudRelPipeline: _HttpNsAdobeComAdobecloudRelPipeline,
                    HttpNsAdobeComAdobecloudRelAuthor: _HttpNsAdobeComAdobecloudRelAuthor,
                    HttpNsAdobeComAdobecloudRelPublish: _HttpNsAdobeComAdobecloudRelPublish,
                    HttpNsAdobeComAdobecloudRelDeveloperConsole: _HttpNsAdobeComAdobecloudRelDeveloperConsole,
                    HttpNsAdobeComAdobecloudRelLogs: _HttpNsAdobeComAdobecloudRelLogs,
                    HttpNsAdobeComAdobecloudRelVariables: _HttpNsAdobeComAdobecloudRelVariables,
                    Self: _Self
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}